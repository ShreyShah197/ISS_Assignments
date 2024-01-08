package strings;

public class MyInfo {

	public static void main(String[] args) {
		char[] name = {'S','H','R','E','Y'};
		String s = new String(name);
		System.out.println(s);
		String companyName = "ISS";
		System.out.println(companyName);
		String departmentName = new String("Developnemt");
		System.out.println(departmentName);
		//String Methods
		int value = s.length();
        System.out.println(value);

        String lstring = companyName.toLowerCase();
        System.out.println(lstring);

        String ustring = companyName.toUpperCase();
        System.out.println(ustring);

        String egString = "     Shrey     ";
        System.out.println(egString);

        String trimmedString = egString.trim();
        System.out.println(trimmedString);

        System.out.println(s.substring(1));
        System.out.println(s.substring(1,5));

        System.out.println(s.replace('S', 'P'));

        System.out.println(s.charAt(3));

        System.out.println(s.indexOf("Y"));

	}

}
