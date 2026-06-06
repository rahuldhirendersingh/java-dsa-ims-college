public class Strs {
    public static void main(String[] args) {
//        String name1 = "Max";
//        String name2 = "Max";

//        String name1 = new String("Max");
//        String name2 = new String("Max");
//        System.out.println(name1 == name2);
//        System.out.println(name1.equals(name2));

        StringBuilder alphabets = new StringBuilder();

        for (int i = 65; i <= 90; i++) {
            char letter = (char) i;
            alphabets.append(letter);
        }

        System.out.println(alphabets);
    }
}
