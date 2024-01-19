import java.util.Objects;

public class Gryffindor extends Hogwarts {
    //гриффендор
    private Integer nobility; //благородство
    private Integer honor; //честь
    private Integer courage; //храбрость


    public Gryffindor(String fullName,
                      Integer thePowerOfMagic,
                      Integer transgression,
                      Integer nobility,
                      Integer honor,
                      Integer courage) {
        super(fullName, thePowerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public Integer getNobility() {return nobility;}
    public Integer getHonor() {return honor;}
    public Integer getCourage() {return courage;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gryffindor that)) return false;
        return Objects.equals(nobility, that.nobility) &&
                Objects.equals(honor, that.honor) &&
                Objects.equals(courage, that.courage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, courage);
    }

    @Override
    public String toString() {
        return "Gryffindor{" + '\'' +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
