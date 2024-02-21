public final class gn {
   public int a;
   public int b;
   public gl a;

   public gn(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.a = new gl(var3, var4);
   }

   public final boolean a(int var1, int var2, int var3, int var4) {
      boolean var5 = a(this.a, var1, var1 + var3) || a(var1, this.a, this.a + this.a.a);
      boolean var6 = a(this.b, var2, var2 + var4) || a(var2, this.b, this.b + this.a.b);
      return var5 && var6;
   }

   public final boolean a(gn var1) {
      return this.a(var1.a, var1.b, var1.a.a, var1.a.b);
   }

   private static boolean a(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }
}
