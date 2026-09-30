class FriendsPair {

    public static int friendp(int n) {
        if (n == 1 || n == 2) {
            return n; 
        }

        return friendp(n - 1) + (n - 1) * friendp(n - 2); 
    }
    public static void main(String[] args) {
        System.out.println(friendp(3));
    }
}