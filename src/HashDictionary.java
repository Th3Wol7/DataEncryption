public class HashDictionary {

    private String plaintxt;
    private String hashtxt;

    public HashDictionary(String plaintxt, String hashtxt) {
        this.plaintxt = plaintxt;
        this.hashtxt = hashtxt;
    }

    public String getPlaintxt() {
        return plaintxt;
    }

    public void setPlaintxt(String plaintxt) {
        this.plaintxt = plaintxt;
    }

    public String getHashtxt() {
        return hashtxt;
    }

    public void setHashtxt(String hashtxt) {
        this.hashtxt = hashtxt;
    }

    @Override
    public String toString() {
        return "plaintxt: " + plaintxt + " hashtxt:" + hashtxt;
    }
}