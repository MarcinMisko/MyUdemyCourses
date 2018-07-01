package flyweight;

public abstract class ChessPiece {
    private final String name;
    private final String numberPosition;
    private final String letterPosition;
    private final Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "white":
                this.color = ColorRepository.getWhite();
                break;
            default:
                this.color = ColorRepository.getBlack();
                break;
        }
    }

    public Color getColor() {
        return color;
    }
}
