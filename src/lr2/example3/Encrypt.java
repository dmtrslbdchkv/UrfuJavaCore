package lr2.example3;

public class Encrypt {
    private String encryptString;
    private String decryptString;
    private String textForEncrypt;
    private int shift;

    public Encrypt(String textForEncrypt, int shift) {
        this.textForEncrypt = textForEncrypt;
        this.shift = shift;
    }

    public void setEncryptString(String encryptString) {
        this.encryptString = encryptString;
    }

    public void setDecryptString(String decryptString) {
        this.decryptString = decryptString;
    }

    public String getTextForEncrypt() {
        return textForEncrypt;
    }

    public void setTextForEncrypt(String textForEncrypt) {
        this.textForEncrypt = textForEncrypt;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getEncryptString() {
        char[] arrayChar = textForEncrypt.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return encryptString;
    }

    public String getDecryptString() {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] - shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        decryptString = new String(arrayCharNew);
        return decryptString;
    }
}
