class Word {

    public static void count(String ch) {
        int count = 0; 
        int length = Integer.MIN_VALUE; 
        for (int i = 0; i < ch.length(); i++) {
            while (ch.charAt(i) != ' '){
                count++; 
            } 
            // if (count > length) {
            //     length = count; 
            // }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String ch = "Hi my name is Vishal"; 
        count(ch);
    }
}