public class BinOps {
    public String sum(String a, String b) {
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        int result = arg0 + arg1;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        int result = arg0 * arg1;
        return Integer.toBinaryString(result);
    }
}