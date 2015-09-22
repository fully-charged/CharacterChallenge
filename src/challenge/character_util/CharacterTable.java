package challenge.character_util;

import java.util.function.Supplier;

public class CharacterTable implements Supplier<char[][]>{

    private final int rows;
    private final int columns;
    private final char[][] table;

    public CharacterTable(final int rows, final int columns){
        this.rows = rows;
        this.columns = columns;

        table = new char[rows][columns];
    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    public void setChar(final int row, final int col, final char c){
        table[row][col] = c;
    }

    public void setRow(final int row, final char[] chars){
        assert chars.length == rows;
        for(int i = 0; i < chars.length; i++)
            setChar(row, i, chars[i]);
    }

    public char[] getRow(final int row){
        return table[row];
    }

    public String toString(final int row, final String delimiter){
        final StringBuilder bldr = new StringBuilder();
        final char[] chars = getRow(row);
        for(int i = 0; i < chars.length; i++){
            if(i > 0 && i < rows)
                bldr.append(delimiter);
            bldr.append(chars[i]);
        }
        return bldr.toString();
    }

    public String toString(final String delimiter){
        final StringBuilder bldr = new StringBuilder();
        for(int i = 0; i < rows; i++)
            bldr.append(toString(i, delimiter)).append(System.lineSeparator());
        return bldr.toString();
    }

    public char[][] get(){
        return table;
    }

}
