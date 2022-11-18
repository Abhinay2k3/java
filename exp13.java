class exp13
{
    static int sr = 3;

    static int sc = 3;

    static void floodFillUtil(int image[][], int x, int y, int oldcolor, int newcolor)
    {
        if (x < 0 || x >= sr || y < 0 || y >= sc)
            return;
        if (image[x][y] != oldcolor)
            return;
        image[x][y] = newcolor;
        floodFillUtil(image, x+1, y, oldcolor, newcolor);
        floodFillUtil(image, x-1, y, oldcolor, newcolor);
        floodFillUtil(image,  x, y+1,oldcolor, newcolor);
        floodFillUtil(image,  x, y-1, oldcolor, newcolor);
    }
    static void floodFill(int image[][], int x, int y, int newcolor)
    {

        int oldcolor = image[x][y];
        if(oldcolor==newcolor)
            return;
        floodFillUtil(image, x, y, oldcolor, newcolor);
    }


    public static void main(String[] args)
    {

        int image[][] = {    {1, 1, 1},

                             {1, 1, 0},

                             {1, 0, 1},

        };

        int x = 1, y = 1, newcolor = 2;

        floodFill(image, x, y, newcolor);


        System.out.println("Updated screen after call to floodFill: ");

        for (int i = 0; i < sr; i++)

        {

            for (int j = 0; j < sc; j++)

                System.out.print(image[i][j] + " ");

            System.out.println();

        }

    }
}
