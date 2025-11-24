long computeI(int n) {
    long result= 1;

    for (inti= l; i <= n; i++)
        result*= i;

    return result;
}

long computeR(int n) { if (n == 1) return n;
    return computeR(n - 1) * n;
}
}
public static void rnain(String[] args)
{ Factorial f = new Factorial();
    Systern.out.println("Факториал рассчитанный в цикле");
    for (int i = 6;	i > 0;	i--) {
        System.out.println(i + "1 = 0	+ f.cornputeI(i));
    }

    Systern.out.println("Факториал, рассчитанный с помощью рекурсии");
    for (int r = 1; r <=	6; r++) {
        Systern.out.println(t + "! = " + f.computeR(r));
    }

}

}