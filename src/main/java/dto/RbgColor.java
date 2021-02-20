package dto;

public class RbgColor {
    private Integer red;
    private Integer blue;
    private Integer green;

    public Integer getRed() {
        return red;
    }

    public void setRed(Integer red) {
        this.red = red;
    }

    public Integer getBlue() {
        return blue;
    }

    public void setBlue(Integer blue) {
        this.blue = blue;
    }

    public Integer getGreen() {
        return green;
    }

    public void setGreen(Integer green) {
        this.green = green;
    }

    public boolean compareValue(RbgColor rbgColor) {
        if (this.blue == rbgColor.blue && this.red == rbgColor.red && this.green == rbgColor.green) {
            return true;
        }
        return false;
    }
}