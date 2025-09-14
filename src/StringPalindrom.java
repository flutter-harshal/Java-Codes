public class StringPalindrom {
    public static void main(String[] args) {
        String string ="nayan";

        String string1=string;
//Using StringBuilder
//        StringBuilder reverse = new StringBuilder();
//        for (int i=string.length()-1;i>=0;i--){
//            reverse.append(string.charAt(i));
//
//        }
//        System.out.println(reverse);
//         if(string1.equals(reverse.toString())){
//             System.out.println("Its a Palindrom string");
//
//         }else {
//             System.out.println("Its not a palindrom String");
//         }

String reverse = "";
        for (int i=string.length()-1;i>=0;i--){
            reverse=reverse+string.charAt(i);

        }
        System.out.println(reverse);
        if (string1.equals(reverse.toString())){
            System.out.println("Its a Palindrom string");
        }else
        {
            System.out.println("Its not a palindrom String");
        }
    }
}
