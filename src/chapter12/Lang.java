package chapter12;

public enum Lang {

    ARM("Հայաստան",1),
    RU("Ռուսաստան"),
    ENG("Մեծ Բրիտանիա");

    private String countryName;
    private int count;


    Lang(String countryName,int count){
        this.countryName=countryName;
        this.count=count;
    }

    Lang(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCount() {
        return count;
    }
}
