public final class ay extends gh {
   private long a;
   private int b = 0;
   private long b;
   private long c;
   private int c;
   private int d;
   private int e;
   private String a;

   public final void a(int var1, int var2, long var3) {
      if (var3 != 0L) {
         super.a();
         this.d = var1;
         this.e = var2;
         this.b = System.currentTimeMillis();
         this.c = var3;
         String var5 = var3 > 0L ? "+" : "-";
         this.a = var5 + au.a(this.c);
         this.c = v.c().a(this.a);
         this.c += 14;
         this.a = true;
      }
   }

   public final void a(long var1) {
      if (var1 - this.a > 100L) {
         this.b = (this.b + 1) % 5;
         this.a = var1;
      }

      if (var1 - this.b > 2000L) {
         this.a = false;
      } else {
         this.e -= 2;
      }
   }

   public final void b() {
      int var1 = this.d - (this.c >> 1);
      v.c().a(bc.a, this.a, var1, this.e, 0);
      bc.a.drawRegion(v.g, this.b * 14, 0, 14, 14, 0, var1 + this.c + 1 - 14, this.e, 0);
   }
}
