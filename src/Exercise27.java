

public class Exercise27 {

    public static class Text implements Comparable<Text> {
        private String mText;

        public Text(String text) {
            mText = text;
        }

        public String getText() {
            return mText;
        }

        @Override
        public int compareTo(Text right) {
            return mText.compareTo(right.getText());
        }
    }

    public static void main(String[] args) {
        Text text1 = new Text("aaa");
        Text text2 = new Text("aaa");

        System.out.println(text1.compareTo(text2));
    }

}
