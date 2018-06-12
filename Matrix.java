//Опишем сам объект матрица
public class Matrix{
	private double[][]  matrix;
//для матрицы необходима возможность задавать размер
public Matrix(){
public void setSizeColumn(int columns, int rows)
{
//так же необходима возможность получить размер для последующих вычеслений
public MatrixSize getSize()
{
int rows = matrix[0].length;
int columns = matrix.length;
return new MatrixSize(columns,rows);
}
//добавление конкретных позиций для элементов матрицы
public void setElement(int columnPosition, int rowPosition, double value)
{
matrix[columnPosition][rowPosition] = value;
}
//получение элементов матрицы
public void getElement(int columns, int rows)
{
Matrix m = new Matrix();
m.setSize(columns, rows);
return m;
}

}
}
}

