package Default;


// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		CharSequenceTokio array = new ArrayCharSequenceTokio("Hola, que tal?".toCharArray());
		System.out.println(array.length()+"-"+array.charAt(2));
		System.out.println(array);
		System.out.println(array.subSequence(2, 7));
		
		String cadena = ("Hola, muy buenas");
		CharSequenceTokio array2 = new BackwardsStringCharSequenceTokio(cadena);
		System.out.println(array2.length()+"-"+array2.charAt(3));
		System.out.println(array2.subSequence(3, 16));
	}

}
