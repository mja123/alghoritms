package metaHackathon;

import metaHackathon.utils.FIleUtil;

import javax.swing.text.html.Option;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ZigZag {

    public static void main(String[] args) {

        File file = new File("src/resources/zigZag/zigzag_medium_1533264006842378_input.txt");

        try(Scanner scanner = new Scanner(file)) {
            int grids = scanner.nextInt();
            int topLeftCellSum = 0;

            Optional<List<List<List<Integer>>>> matrix = fillMatrixWithFile(file);
            if (matrix.isPresent()) {
                for (int i = 0; i < grids; i++) {
                    topLeftCellSum += zigZagSolver(matrix.get().get(i));
                }
            }

            FIleUtil.createAnswerFile(topLeftCellSum, "src/resources/zigZag/zigZagResult.txt");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Optional<List<List<List<Integer>>>> fillMatrixWithFile(File file) {
        List<List<List<Integer>>> grids = new ArrayList<>();
        List<List<Integer>> matrix = new ArrayList<>();

        //Delimiting the next element as the entire line
        try(Scanner scanner = new Scanner(file).useDelimiter("\n")) {
            //If is the first line (count of grids), continue
            scanner.next();

            while(scanner.hasNext()) {

                String line = scanner.next();

                //If the grid finish, break
                if (line.equals("")) {
                    grids.add(new ArrayList<>(matrix));
                    //System.out.println(grids.get(0).size());
                    matrix.clear();
                    //System.out.println(grids.get(0).size());
                    continue;
                }
                if (!scanner.hasNext()) {
                    fillTheList(line, matrix);
                    grids.add(matrix);
                    break;
                }

                fillTheList(line, matrix);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return Optional.of(grids);
    }

    private static void fillTheList(String line, List<List<Integer>> matrix) {
        //Changing '.' for -1 to manipulate the line as a line of integers
        line = line.replace(".", "-1");
        //Add a new ArrayList with all the elements in the line parsed to integers
        matrix.add(new ArrayList<>
                (Arrays.stream(line.split("\s"))
                        .map(Integer::valueOf).collect(Collectors.toList())));
    }
    public static int zigZagSolver(List<List<Integer>> matrix) {
        List<Integer> numbers = new ArrayList<>();
        int result = 0;

        //Check all the elements in the first column
        for (List<Integer> integers : matrix) {
            Integer rowElement = integers.get(0);

            if (numbers.contains(rowElement) || rowElement == -1) {
                continue;
            }
            numbers.add(rowElement);
        }

        //Check all the elements in the last column
        for (List<Integer> integers : matrix) {
            Integer rowElement = integers.get(integers.size() - 1);

            if (numbers.contains(rowElement) || rowElement == -1) {
                continue;
            }
            numbers.add(rowElement);
        }

        //Check all the elements in the fist row
        for (int i = 0; i < matrix.get(0).size(); i++) {
            Integer rowElement = matrix.get(0).get(i);

            if (numbers.contains(rowElement) || rowElement == -1) {
                continue;
            }
            numbers.add(rowElement);

        }

        //Check all the elements in the principal diagonal
        for (int i = 0; i < matrix.get(0).size(); i++) {
            Integer rowElement = matrix.get(i).get(i);

            if (numbers.contains(rowElement) || rowElement == -1) {
                continue;
            }
            numbers.add(rowElement);
        }

        //Check which element isn't in the array
        for (int i = 0; i < numbers.size(); i++) {
            if (!numbers.contains(i)) {
                result = i;
            }
        }
        return result;
    }
}


//Problem
//        We have updated the inputs and outputs of the first coding challenge (ZigZag). Please download the full input file again to have the updated version.
//        ZigZag is a logic-based, combinatorial number-placement puzzle, similar to Sudoku. The objective is to fill a 9x9 grid so that each zig, zag and square contain all the digits from 0 to 8, inclusive, exactly once.
//        Zigs are diagonals, running from top left to bottom-right and wrapping around. Zags are diagonals, running from top-right to bottom-left (orthogonal to the zigs) and squares are 3x3 sub-grids, similar to Sudoku.
//        The following diagrams indicate which Zigs, Zags and Squares each cell in a ZigZag belongs to. In the Zigs diagram (left), all the cells in a Zig share a color and are connected by lines to a cell with the Zig's numeric label. The Zags and Squares diagrams are organised similarly:
//
//        Note that Zigs and Zags wrap around the grid, so each label appears twice in these diagrams.
//        Given a list of unfinished ZigZags, provide the sum of the values of their top-left cells. Note that for every ZigZag grid in the input, it's guaranteed that the value of its top-left cell can be deduced by looking at just the cells in Zig 0, Zag 0, and Square 0.
//        Input
//        The input file format is as follows:
//        The first line contains a single integer N, indicating the number of grids to follow.
//        Each grid is printed with each of its rows on its own line.
//        The "." character indicates an empty cell.
//        Grids are separated from each other with an empty line.
//        Output
//        Your output should be a file containing a single line with a number that's the sum of the values of the top-left cells of all grids, after the puzzles have been solved.
//        Constraints
//        1 ≤ N ≤ 10,000
//        Explanation of Sample
//        There are 3 puzzles in the sample. After solving all of them, the sum of the top left cells of all three of them is 1 + 8 + 4 = 13