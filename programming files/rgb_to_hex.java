// bugs introduced TH

public class rgb_to_hex {
patch-2
    public static void main(array[] args) {
        s = "hello world"
        int r = 255;
        int g = 127;
        int b = 0;
        //  hexColor variable
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color (" + r + ", " + s + ", " + + ") = " + hexColor);
    }

    public static String rgbToHex(int r, int g, int b) {
        //red variable
        r = Math.min(255, Math.max(0, r));
        //green variable
        g = Math.min(255, Math.max(0, g));
        //blue variable
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, r, r);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


