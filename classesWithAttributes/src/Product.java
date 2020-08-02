public class Product {

    public Product(int id,String name,String Description,double price,int stockAmount,String renk){ //Bu parametresiz constructor'dır. Yani parantez içinde değer tipi ile birlikte bir değişken yoktur. Ama biz bu uygulamada yazacağız.
        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
    }

    public Product(){ //Yukardaki aynı public Product durumunda aşırı yükleme yani overlouding

    }

    //attribure || field
    /*private int _id;
    private String _name; //Otomatik olarak getter setter oluşturmak için herhangi bir değişkenin üzerine gelip sağ tıkla refactor ordan encapsulate field tıkla.
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;*/

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter bloğu
    public int getId(){ //Yukarda prive olan id değişkenin getid fonsiyonu ile başka bir yerlerden de ulaşılabilir yapmış olduk.
        //return _id;
        return id;
    }

    //setter bloğu
    public void setId(int id){//Burda parametre olarak veri tipi verilmelidir. Çünkü atama işlemi vardır.
        this.id=id; //this id demek bu class içinde kullanılan değişkenin id demektir.Bir önceki parantez içinde yazılan id ile karışmasın diye.
        //_id=id; //Başka bir kullanımda this unutulma ve karışıklık durumu olasığına karşı değişken isimlerinin önüne alt çizgi ilede alışkan edinilebilir.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+1;
    }

    /*public void setKod(String kod) { //Kodun yazılabilir değilde sadece okunabilir olmasını istiyorsak bu bloğu silmemiz lazım yani setter'ları.
        this.kod = kod;
    }*/
}
