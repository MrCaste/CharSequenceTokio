package Default;

// TODO: Auto-generated Javadoc
/**
 * The Class BackwardsStringCharSequenceTokio.
 */
public class BackwardsStringCharSequenceTokio implements CharSequenceTokio {
	
	/** The cadena. */
	private String cadena;
	
	/**
	 * Instantiates a new backwards string char sequence tokio.
	 *
	 * @param cadena the cadena
	 */
	public BackwardsStringCharSequenceTokio(String cadena) {
		super();
		this.cadena = cadena;
	}

	/**
	 * Length.
	 *
	 * @return the int
	 */
	@Override
	public int length() {
	  return cadena.length();
	}

	/**
	 * Char at.
	 *
	 * @param index the index
	 * @return the char
	 */
	@Override
	public char charAt(int index) {
	  if(index > cadena.length() || index < 0) {
	    return 0;
	  }
	  return cadena.charAt(cadena.length()-1-index);
	}

	/**
	 * Sub sequence.
	 *
	 * @param start the start
	 * @param end the end
	 * @return the char sequence tokio
	 */
	@Override
	public CharSequenceTokio subSequence(int start, int end) {
	  if(start < 0 || end > length() || start > end) {
	    return null;
	  }
	  int subsequence = end - start;
	  int startInvertido = length() - start;
	  int endInvertido = length() - end;
	  char[] nuevoArray = new char[subsequence];
	  int j = 0;
	  for (int i = startInvertido-1; i > endInvertido-1; i--) {
		nuevoArray[j] = cadena.charAt(i);
		j++;
	  }
	  return new ArrayCharSequenceTokio(nuevoArray);
	}

}
