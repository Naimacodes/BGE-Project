package fr.bge.facilities;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

public class Utils {
	private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyy-MM-dd");

	public final static String CONTRAINTE_INTEGRITE_REFERENTIELLE_REGEX = "Duplicate entry '.*' for key '.*UNIQUE_.*'";
	public final static Pattern CONTRAINTE_INTEGRITE_REFERENTIELLE_PATTERN = Pattern
			.compile(CONTRAINTE_INTEGRITE_REFERENTIELLE_REGEX);

	private final static DecimalFormatSymbols DECIMAL_FORMAT_SYMBOLS = DecimalFormatSymbols.getInstance();
	static { // Code Exécuté au moment ou java charge la classe
		DECIMAL_FORMAT_SYMBOLS.setDecimalSeparator('.');
	}
	private final static DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00", DECIMAL_FORMAT_SYMBOLS);

	/**
	 * Permet de recuperer la dernière exception dans une stack trace, de manière
	 * récursive.
	 * 
	 * @param t l'exception à ouvrir
	 * @return la dernière cause
	 * @see Throwable#getCause()
	 */
	public final static Throwable unwrapThrowable(Throwable t) {
		return t.getCause() == null ? t : unwrapThrowable(t.getCause());
	}

	public static boolean isReferentialIntegrityConstraint(Throwable t) {
		if (t instanceof SQLIntegrityConstraintViolationException) {
			if (t.getMessage() != null
					&& CONTRAINTE_INTEGRITE_REFERENTIELLE_PATTERN.matcher(t.getMessage()).matches()) {
				return true;
			}
		}
		return false;
	}

	public static Boolean getBoolean(String param, HttpServletRequest request) {
		String value = request.getParameter(param);
		return Boolean.valueOf(value);
	}

	/**
	 * Extrait le paramètre nommé 'param' de la requete http (request) et tente de
	 * le transformer en Long. Si il ne peut pas la méthode lève une exception comme
	 * dans la méthode {@link Long#valueOf(String)}
	 * 
	 * @param param   le nom du paramètre
	 * @param request la requete http
	 * @return le parametre http sous forme de Long
	 * @throws NumberFormatException si le paramètre ne peut être transformé en Long
	 * @see Long#valueOf(String)
	 */
	public static Long getLong(String param, HttpServletRequest request) throws NumberFormatException {
		String value = request.getParameter(param);
		return Long.valueOf(value);
	}

	/**
	 * Recupere le paramètre et retourne un {@link BigDecimal} arrondi a 10-2 au
	 * plus proche
	 * 
	 * @param param
	 * @param request
	 * @return
	 * @throws ParseException
	 */
	public static BigDecimal getBigDecimal(String param, HttpServletRequest request) throws ParseException {
		return getBigDecimal(param, request, 2);
	}

	/**
	 * Recupere le paramètre et retourne un {@link BigDecimal} arrondi a la valeur
	 * spécifié dans l'argument <i>roundAt</i> de la méthode au plus proche
	 * 
	 * @param param
	 * @param request
	 * @param roundAt le nombre de décimale pour procéder à l'arrondi
	 * @return
	 * @throws ParseException
	 */
	public static BigDecimal getBigDecimal(String param, HttpServletRequest request, int roundAt)
			throws ParseException {
		String value = request.getParameter(param).replace(',', '.');
		Number number = DECIMAL_FORMAT.parse(value);
		// MathContext mc = new MathContext(roundAt, RoundingMode.HALF_EVEN);
		return new BigDecimal(number.doubleValue()).setScale(roundAt, RoundingMode.HALF_EVEN);
	}

	public static Date getDate(String string, HttpServletRequest request) {
		String value = request.getParameter(string);			
		try {
			return DATE_FORMAT.parse(value);
		} catch (ParseException e) {
			throw new IllegalArgumentException("La date est invalide (yyyy-MM-dd) : " + value, e);
		}
	}

	public static String hashageSHA256(String param) {
		String salt = "5f8f041b75042e56";

		try {
			// TODO convertir le champ MdP en format Blob dans la BDD.
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] result = digest.digest((param + salt).getBytes("UTF-8"));

			StringBuilder sb = new StringBuilder();
			for (byte b : result) {
				sb.append(String.format("%02x", b));
			}

			return sb.toString();

		} catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
			return null;
		}
	}
}
