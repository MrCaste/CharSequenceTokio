package Default;

// TODO: Auto-generated Javadoc
/**
 * The Class ArrayCharSequenceTokio.
 */
public class ArrayCharSequenceTokio implements CharSequenceTokio {
	
	/** The array chars. */
	private char[] arrayChars;
	
	

	/**
	 * Instantiates a new array char sequence tokio.
	 *
	 * @param arrayChars the array chars
	 */
	public ArrayCharSequenceTokio(char[] arrayChars) {
		super();
		this.arrayChars = arrayChars;
	}

	/**
	 * Length.
	 *
	 * @return the int
	 */
	@Override
	public int length() {
	  return arrayChars.length;
	}

	/**
	 * Char at.
	 *
	 * @param index the index
	 * @return the char
	 */
	@Override
	public char charAt(int index) {
		  if(index > arrayChars.length || index < 0) {
		    return 0;
		  }
	  return arrayChars[index];
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
	  if(start < 0 || end > arrayChars.length || start > end) {
	    return null;
	  }
	  int subSequence = end - start;
	  char[] nuevoArray = new char [subSequence];
	  for (int i = 0; i < subSequence; i++) {
	    nuevoArray[i] = arrayChars[start + i];
	  }
	  return new ArrayCharSequenceTokio(nuevoArray);
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return new String(arrayChars);
	}
	
	

}
