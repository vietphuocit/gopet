public final class bq extends ds {
   public bn a;

   public bq(int var1, byte var2, eg var3) {
      super(var1, var2, var3);
   }

   public final void a(long var1) {
      int var3 = this.m;
      int var4 = this.n;
      super.a(var1);
      int var5 = this.m - var3;
      int var2 = this.n - var4;
      if (this.a != null && (var5 != 0 || var2 != 0)) {
         bn var10000 = this.a;
         var2 = var5;
         bn var6 = var10000;
         if ((var3 = var10000.a.m - var6.m) < -30) {
            var6.m = var6.a.m + 30;
         } else if (var3 > 30) {
            var6.m = var6.a.m - 30;
         }

         if ((var4 = var6.a.n - var6.n) < -15) {
            var6.n = var6.a.n + 15;
         } else if (var4 > 15) {
            var6.n = var6.a.n - 15;
         }

         if (var3 < 0) {
            var6.a = 0;
         } else {
            var6.a = 2;
         }

         if (var2 != 0) {
            if (var6.n < var6.a.n) {
               var6.n += 2;
               if (var6.n > var6.a.n) {
                  var6.n = var6.a.n;
                  return;
               }
            } else if (var6.n > var6.a.n) {
               var6.n -= 2;
               if (var6.n < var6.a.n) {
                  var6.n = var6.a.n;
               }
            }
         }
      }

   }

   public final void a(int var1, int var2) {
      super.a(var1, var2);
   }

   public final void a(ea var1) {
      var1.b(this.a);
      bg var2;
      if ((var2 = ((bx)eg.a).a(this.a)) != null) {
         var2.c();
      }

   }

   final void a(bn var1) {
      if (this.a != null) {
         eg.a.b(this.a);
      }

      this.a = var1;
      eg.a.a((dz)this.a);
      eg.a.c(this.a);
   }

   final void a(int var1) {
      if (this.a != null && this.a.b == var1) {
         eg.a.b(this.a);
      }

      this.a = null;
   }
}
