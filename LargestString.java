public class LargestString {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String st[]={"WhelcometoJava","shubham","tiwari","ritika","ranjana"};
        String largest=st[0];
        for(int i=0; i<st.length;i++){
            if (largest.compareTo(st[i])<0) {
                largest= st[i];
            }
        }
        System.out.println(largest);

    }
}
