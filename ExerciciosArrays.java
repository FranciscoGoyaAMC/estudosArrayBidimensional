/*
Exercícios: Arrays Bidimensionais
Crie uma classe chamada ExerciciosArrays.
Nesta classe, faça os métodos dos exercícios 1 até o 11.
 */
import java.util.Random;
import java.util.Scanner;


public class ExerciciosArrays
{
/*
Exercício 1:
a) Crie um método chamado exercicio1a, que retorna o array de inteiros abaixo:
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
*/
    public static int[][] exercicio1a()
    {
        int[][] array = new int[3][10];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                array[i][j] = j;
            }
        }
        return array;
    }
/*Exercício 1:
b) Crie um método chamado exercicio1b, que retorna o array de inteiros abaixo:
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
0 1 4 9 16 25 36 49 64 81
 */
    public static int[][] exercicio1b()
    {
        int[][] array = new int[5][10];

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                array[i][j] = j * j;
            }
        }
        return array;
    }
/*
Exercíco 1:
c) Crie um método chamado exercicio1c, que retorna o array de inteiros abaixo:
0 0 0 0 0 0
1 1 1 1 1 1
2 2 2 2 2 2
3 3 3 3 3 3
4 4 4 4 4 4
5 5 5 5 5 5
 */
    public static int[][] exercicio1c()
    {
        int[][] array = new int[6][6];

        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                array[i][j] = i;
            }
        }
        return array;
    }
/*
Exercício 1:
d) Crie um método chamado exercicio1d, que retorna o array de inteiros abaixo:
-1 -1 -1 -1 -1 -1
0 0 0 0 0 0
-1 -1 -1 -1 -1 -1
0 0 0 0 0 0
-1 -1 -1 -1 -1 -1
0 0 0 0 0 0
-1 -1 -1 -1 -1 -1
0 0 0 0 0 0
-1 -1 -1 -1 -1 -1    
*/
    public static int[][] exercicio1d()
    {
        int[][] array = new int[9][6];

        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (i % 2 == 0)
                {
                    array[i][j] = -1;
                }
                else
                {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
/*
Exercício 2: 
Crie um método que retorna uma matriz de inteiros com números aleatórios positivos
menores que 100. O tamanho da matriz deve ser solicitado pelo teclado dentro do método.
 */
    public static int[][] exercicio2()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Exercício 2");
        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();
        
        int[][] array = new int[linhas][colunas];
        
        for (int i = 0; i < linhas; i++)
        {
            for (int j = 0; j < colunas; j++)
            {
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }
/*
Exercício 3:
Escreva um método que leia 10 valores double do teclado e armazene-os em uma
matriz de dimensões 2x5. Seu método deve retornar esta matriz.
 */
    public static double[][] exercicio3()
    {
        double[][] array = new double[2][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 3");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print("Digite o valor double para a linha " + i + " e coluna " + j + " da matriz: ");
                double valor = scanner.nextDouble();
                
                array[i][j] = valor;
            }
        }
        return array;
    }
/*
Exercício 4:
Crie um método que recebe um array bidimensional de double e retorna a quantidade
de elementos deste array.
 */
    public static int exercicio4(double[][] array)
    {
        return array.length * array[0].length;
    }

/*
Exercício 5:
Crie um método que recebe um array bidimensional de double e retorna a quantidade
de elementos deste array.

ESTE EXERCÍCIO É IGUAL AO 4.
 */

/*
Exercício 6:
Crie um método que recebe uma matriz de double e retorna um String de saída
para ela, com seus valores separados por um hífen, mas mantendo o formato da matriz.
 */
    public static String exercicio6(double[][] array)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                sb.append(array[i][j]);
                if (j < array[i].length - 1)
                {
                    sb.append(" - ");
                }
            }
            if (i < array.length - 1)
            {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
/*
Exercício 7:
Crie um método que recebe uma matriz de double e retorna o maior valor da matriz.
 */
    public static double exercicio7(double[][] array)
    {
        double maxVal = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] > maxVal)
                {
                    maxVal = array[i][j];
                }
            }
        }
        return maxVal;
    }
/*
Exercício 8:
Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os
elementos da matriz
 */
    public static int exercicio8(int[][] array)
    {
        int soma = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                soma += array[i][j];
            }
        }
        return soma;
    }
/*
Exercício 9:
Crie um método que recebe um array bidimensional de double e retorna a média dos
valores deste array.
 */
    public static double exercicio9(double[][] array)
    {
    double soma = 0.0;
    int totalElementos = 0;

    for (int i = 0; i < array.length; i++)
    {
        for (int j = 0; j < array[i].length; j++)
        {
            soma += array[i][j];
            totalElementos++;
        }
    }

    return soma / totalElementos;
    }
/*
Exercício 10:
Crie um método que devolve uma matriz de caracteres lidos do teclado. O número de
linhas da matriz deve ser aleatório, entre 1 e 5, enquanto o número de colunas deve ser também
aleatório, porém, entre 1 e 3.
 */
    public static char[][] exercicio10()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int linhas = random.nextInt(5) + 1;
        int colunas = random.nextInt(3) + 1;
        char[][] array = new char[linhas][colunas];

        for (int i = 0; i < linhas; i++)
        {
            for (int j = 0; j < colunas; j++)
            {
                System.out.print("Digite o caractere para a posição [" + i + "][" + j + "]: ");
                array[i][j] = scanner.next().charAt(0);
            }
        }

        return array;
    }
/*
Exercício 11: 
Crie um método que recebe uma matriz de inteiros e retorna um array unidimensional
que contém apenas os elementos positivos desta matriz.
 */
    public static int[] exercicio11(int[][] array)
    {
        int positivos = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] > 0)
                {
                    positivos++;
                }
            }
        }

        int[] arrayPositivos = new int[positivos];
        int indice = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] > 0)
                {
                    arrayPositivos[indice] = array[i][j];
                    indice++;
                }
            }
        }

        return arrayPositivos;
    }

    public static void main(String[] args)
    {
        int[][] resultadoA = exercicio1a();
        
        System.out.println("Exercício 1A:");
        for (int[] linha : resultadoA)
        {
            for (int num : linha)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        } 
        System.out.println();
        
        int[][] resultadoB = exercicio1b();
        
        System.out.println("Exercício 1B:");
        for (int[] linha : resultadoB)
        {
            for (int num : linha)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] resultadoC = exercicio1c();

        System.out.println("Exercício 1C:");
        for (int[] linha : resultadoC)
        {
            for (int num : linha)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] resultadoD = exercicio1d();

        System.out.println("Exercício 1D:");
        for (int[] linha : resultadoD)
        {
            for (int num : linha)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] resultadoE = exercicio2();

        for (int[] linha : resultadoE)
        {
            for (int num : linha)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        double[][] resultadoF = exercicio3();

        for (double[] linha : resultadoF)
        {
            for (double num : linha)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Exercício 4:");
        double[][] resultadoG = new double[3][4];
        System.out.println("Quantidade de elementos na matriz: " + exercicio4(resultadoG));
        System.out.println();
        System.out.println("Exercício 5 está com a mesma solicitação do Exercício 4.");
        System.out.println();

        System.out.println("Exercício 6:");
        double[][] array =
        {
            {2.5, 5.6, 76.3, 98.0},
            {7.9, 4.4, 1.0, 19.4},
            {3.4, 21.0, 12.6, 54.3}
        };

        String resultadoH = exercicio6(array);
        System.out.println(resultadoH);
        System.out.println();

        System.out.println("Exercício 7:");
        double[][] array2 =
        {
            {-1.0, -2.0, -3.0},
            {4.0, 5.0, 6.0},
            {0.0, -1.0, 2.0}
        };

        double resultadoI = exercicio7(array2);
        System.out.println("Maior valor do array é: " + resultadoI);
        System.out.println();

        System.out.println("Exercício 8:");
        int[][] array3 =
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int resultadoJ = exercicio8(array3);
        System.out.println("A soma dos valores do array é: " + resultadoJ);
        System.out.println();

        System.out.println("Exercício 9:");
        double[][] array4 = 
        {
            {1.5, 2.5, 3.5},
            {4.5, 5.5, 6.5},
            {7.5, 8.5, 9.5}
        };
        double resultadoK = exercicio9(array4);
        System.out.println("A média dos valores do array é: " + resultadoK);
        System.out.println();

        System.out.println("Exercício 10:");
        char[][] resultadoL = exercicio10();

        for (char[] linha : resultadoL)
        {
            for (char val : linha)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Exercicio 11:");
        int[][] array5 =
        {
            {1, -2, 3},
            {-4, 5, 6},
            {-7, 8, -9}
        };

        int[] resultadoM = exercicio11(array5);
        System.out.println("Os valores positivos do array são: ");
        for (int valor : resultadoM) 
        {
            System.out.print(valor + " ");
        }
        System.out.println();

    }
}