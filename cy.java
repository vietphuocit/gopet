public final class cy extends fz {
   private int a = 30;
   public byte a;
   public byte b;
   private byte c;
   private fn[] a;
   private int d;

   public cy(int var1, int var2, int var3, int var4, int var5) {
      super(15, var2, var3, var4);
      this.d = var5;
      this.c(2);
      this.j = true;
      this.c = (byte)((var3 + 2) / (var5 + 2));
      var1 = (var4 + 2) / (var5 + 2);
      this.a = this.c * var1;
   }

   public final void a(fn[] var1) {
      this.a = var1;
      this.a = (byte)(var1.length / this.a);
      if (var1.length % this.a != 0) {
         ++this.a;
      }

   }

   public final void a(int var1) {
      if (var1 < this.a && var1 >= 0) {
         this.b = (byte)var1;
         this.m();
         int var2;
         if ((var2 = (var1 *= this.a) + this.a - 1) >= this.a.length) {
            var2 = this.a.length - 1;
         }

         int var3 = 0;
         int var4 = 0;
         int var5 = 0;

         for(int var6 = 0; var6 < this.a.length; ++var6) {
            if (var6 >= var1 && var6 <= var2) {
               fn var8 = this.a[var6];
               this.a(var8, false);
               this.a[var6].b(var3, var4);
               fn var10000 = this.a[var6];
               boolean var9 = false;
               var10000.e = var9;
               ++var5;
               if (var5 >= this.c) {
                  var5 = 0;
                  var3 = 0;
                  var4 += this.d + 2;
               } else {
                  var3 += this.d + 2;
               }
            } else {
               this.a[var6].a = null;
            }
         }

         fy var7 = this.a(0);
         bc.a().a(var7);
      }
   }

   public final boolean a(int var1, int var2) {
      fy var3;
      if ((var3 = this.a(false)) != this && var3 != null && var3.a(var1, var2)) {
         return true;
      } else {
         int var5 = this.c();
         fy var4;
         if (var1 == 0 && var2 == -3) {
            if (this.b > 0 && var5 % this.c == 0) {
               this.a(this.b - 1);
            } else {
               if ((var1 = var5 - 1) < 0) {
                  var1 = 0;
               }

               var4 = this.a(var1);
               bc.a().a(var4);
            }
         } else if (var1 == 0 && var2 == -4) {
            if (this.b < this.a - 1 && var5 % this.c == this.c - 1) {
               this.a(this.b + 1);
            } else {
               var1 = var5 + 1;
               if ((var4 = this.a(var1)) != null) {
                  bc.a().a(var4);
               }
            }
         } else if (var1 == 0 && var2 == -2) {
            if ((var1 = var5 + this.c) >= this.a.length) {
               var1 = this.a.length - 1;
            }

            var4 = this.a(var1);
            bc.a().a(var4);
         } else if (var1 == 0 && var2 == -1) {
            if ((var1 = var5 - this.c) < 0) {
               var1 = 0;
            }

            var4 = this.a(var1);
            bc.a().a(var4);
         }

         return true;
      }
   }
}
