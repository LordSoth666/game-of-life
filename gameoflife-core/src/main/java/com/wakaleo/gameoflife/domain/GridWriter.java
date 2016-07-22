package com.wakaleo.gameoflife.domain;

/**
 * This class generates the Grid in which Game of life is running
 * @author baumgabj
 *
 */
public class GridWriter {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    /**
     * Converts a two dimensional Grid to String
     * @param gridContents
     * @return
     */
    public String convertToString(final Cell[][] gridContents) {
        StringBuffer printedGrid = new StringBuffer();
        for (Cell[] row : gridContents) {
            for (Cell cell : row) {
                printedGrid.append(cell.toString());
            }
            // TODO: This simply masks the problem: why empty rows being passed?
            if (row.length > 0) {
                printedGrid.append(LINE_SEPARATOR);
            }
        }
        return printedGrid.toString();
    }
}
