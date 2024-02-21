public final class bp extends dz {
   public int a;
   private String a;
   private int b;
   private int c;
   private int d;
   private long a;
   private long b;
   private long c;
   private int e;
   private StringBuffer a;

   bp(int var1, String var2, String var3, int var4, int var5, int var6, byte var7) {
      this.a = var1;
      this.a = var2;
      this.d = var3;
      this.m = var5;
      this.n = var6;
      this.g = true;
      this.a(new gn(-10, -10, 20, 20));
      var1 = au.b(5);
      this.c = (long)(var1 * 1000 + 3000);
      this.a = (new StringBuffer("LV ")).append(String.valueOf(var4));
   }

   public final void a(int var1, int var2) {
      bc.a.drawImage(v.k, this.m - var1 - 11, this.n - 6 - var2, 0);
      if (this.b == null) {
         this.b = br.a.a(this.a);
         if (this.b != null) {
            this.b = this.b.getWidth() >> 1;
            this.c = this.b.getHeight();
            return;
         }
      } else {
         bc.a.drawRegion(this.b, this.d * this.b, 0, this.b, this.c, this.e, this.m - var1, this.n - this.b.getHeight() - var2, 17);
         long var3;
         if ((var3 = System.currentTimeMillis()) - this.a >= 200L) {
            this.a = var3;
            this.d = (this.d + 1) % 2;
         }

         if (var3 - this.b >= this.c) {
            this.e = (this.e + 2) % 4;
            int var5 = au.b(5);
            this.c = (long)(var5 * 1000 + 3000);
            this.b = var3;
         }

         v.a().a(bc.a, this.a.toString(), this.m - var1, this.n - this.c - 5 - var2, 17);
      }

   }
}
