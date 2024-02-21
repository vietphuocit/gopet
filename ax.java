public final class ax extends gh {
   private long a;
   private int b = 0;
   private long b;
   private long[] a = new long[2];
   private byte[] a = new byte[2];
   private int c;
   private int d;
   private int e;
   private br a;

   public final void a(br var1, int var2, int var3, long var4, long var6) {
      if (var4 != 0L || var6 != 0L) {
         super.a();
         this.a = var1;
         this.d = var2;
         this.e = var3;
         this.b = System.currentTimeMillis();
         this.a[0] = var4;
         this.a[1] = var6;
         this.c = 0;

         for(int var8 = 0; var8 < this.a.length; ++var8) {
            this.a[var8] = (byte)v.c().a("+" + au.a(this.a[var8]));
            if (this.a[var8] > this.c) {
               this.c = this.a[var8];
            }
         }

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
      int var2 = 0;

      for(int var3 = 0; var3 < 2; ++var3) {
         if (this.a[var3] != 0L) {
            String var4 = this.a[var3] > 0L ? "+" + au.a(this.a[var3]) : au.a(this.a[var3]);
            v.c().a(bc.a, var4, var1, this.e + var2, 0);
            switch(var3) {
            case 0:
               bc.a.drawRegion(v.e, this.b * 14, 0, 14, 14, 0, var1 + this.a[var3] + 1, this.e + var2, 0);
               break;
            case 1:
               bc.a.drawImage(this.a.a, var1 + this.a[var3] + 1, this.e + var2, 0);
            }

            var2 += 20;
         }
      }

   }
}
