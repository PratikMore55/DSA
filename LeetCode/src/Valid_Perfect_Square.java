class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return sqrt == (int)sqrt;
    }
}