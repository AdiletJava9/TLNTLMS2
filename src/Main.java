public class Main {
    public static void main(String[] args) {
        Java java = new Java();
        CSharp cSharp = new CSharp();
        Python python = new Python();
        Backend[] backends = new Backend[]{java, cSharp, python};
        for (Backend n : backends) {
            if (n instanceof Java) {
                java.spring();
            } else if (n instanceof CSharp) {
                cSharp.dotNet();
            } else if (n instanceof Python) {
                python.django();
            }
        }
    }
}