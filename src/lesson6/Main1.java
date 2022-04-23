package lesson6;

public class Main1 {
    public static void main(String[] args) {


        String level = ScannerUtils.getLevelFromUser();
        int[][] field = SaperUtils.createGameField(level);
        int counMines = SaperUtils.countMinesByLevel(level);
        int[][] fieldsWithMines= SaperUtils.feelRandomMines(field,counMines);
        SaperUtils.printMinesFromField(fieldsWithMines);
        //


    }

}
