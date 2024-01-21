import java.util.Objects;

public class Hufflepuff extends Hogwarts{
    //пуффендуй

    private Integer hardWork; //трудолюбие
    private Integer loyalty; //верность
    private Integer honesty; //честность

    public Hufflepuff(String fullName,
                      Integer thePowerOfMagic,
                      Integer transgression,
                      Integer hardWork,
                      Integer loyalty,
                      Integer honesty) {
        super(fullName, thePowerOfMagic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    public Integer getHardWork() {return hardWork;}
    public Integer getLoyalty() {return loyalty;}
    public Integer getHonesty() {return honesty;}


}
