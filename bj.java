final class bj {
   public boolean a;
   private long a;
   Object a;
   private int a;
   private int b;
   private byte a;
   private byte b;
   private final bi a;

   public bj(bi var1, int var2, Object var3) {
      this.a = var1;
      this.a = (byte)var2;
      this.a = var3;
   }

   public final void a() {
      this.a = false;
      this.a = 0L;
      this.a = 0;
      this.b = 0;
      this.b = 0;
   }

   public final void b() {
      int[] var2;
      int var4;
      int var7;
      bi var10000;
      switch(this.a) {
      case 1:
         switch(this.b) {
         case 0:
            this.a = this.a.m + (Integer)this.a;
            this.b = this.a.m;
            this.b = 1;
            return;
         case 1:
            var7 = this.a - this.b;
            var4 = this.a - this.a.m;
            if (this.a > this.a.m) {
               var10000 = this.a;
               var10000.m += 4;
            } else {
               var10000 = this.a;
               var10000.m -= 4;
            }

            if (var7 * var4 <= 0) {
               this.a.m = this.a;
               this.a = true;
            }
         default:
            return;
         }
      case 2:
         switch(this.b) {
         case 0:
            this.a = System.currentTimeMillis();
            this.a = (Integer)this.a;
            this.b = 1;
            return;
         case 1:
            if (System.currentTimeMillis() - this.a > (long)this.a) {
               this.a = true;
            }
         default:
            return;
         }
      case 3:
         switch(this.b) {
         case 0:
            this.a = System.currentTimeMillis();
            this.a = (Integer)this.a;
            this.b = this.a.m;
            this.b = 1;
            return;
         case 1:
            if (System.currentTimeMillis() - this.a > (long)this.a) {
               this.a = true;
            }

            if (this.a.m == this.b) {
               --this.a.m;
               return;
            } else if (this.a.m < this.b) {
               var10000 = this.a;
               var10000.m += 2;
               return;
            } else {
               this.a.m = this.b;
               return;
            }
         default:
            return;
         }
      case 4:
         switch(this.b) {
         case 0:
            gb var10001;
            label143: {
               this.a = System.currentTimeMillis();
               this.b = 1;
               var2 = (int[])this.a;
               this.a.g = var2[0];
               this.a.h = var2[1];
               this.a.i = var2[2];
               this.a.c = true;
               bi.a(this.a, (gb)null);
               var10000 = this.a;
               bi var13;
               if ((var13 = this.a).g >= 4) {
                  if (var13.g < 6) {
                     var10001 = br.a.a[var13.g - 4];
                     break label143;
                  }

                  if (var13.g == 6) {
                     var10001 = br.a.b;
                     break label143;
                  }

                  if (var13.g == 7) {
                     var10001 = br.a.a;
                     break label143;
                  }

                  if (var13.g >= 8) {
                     var10001 = br.a.a(var13.g - 8);
                     break label143;
                  }
               }

               var10001 = null;
            }

            bi.a(var10000, var10001);
            if (bi.a(this.a) != null) {
               bi.a(this.a).a();
            } else {
               this.a = true;
               this.a.c = false;
            }

            return;
         case 1:
            gb var12;
            if (bi.a(this.a) != null && (var12 = bi.a(this.a)).a == var12.a.b - 1) {
               this.a = true;
               this.a.c = false;
            }
         default:
            return;
         }
      case 5:
         this.a.c = 0;
         this.a = true;
         if (this.a.a != null) {
            this.a.a.b();
            return;
         }
         break;
      case 6:
         switch(this.b) {
         case 0:
            this.a = System.currentTimeMillis();
            this.b = 1;
            this.a.k = 0;
            this.a.e = true;
            Object[] var10 = (Object[])this.a;
            this.a.a = (String)var10[0];
            Integer var11;
            if ((var11 = (Integer)var10[1]) == null) {
               this.a.j = 0;
            } else {
               this.a.j = var11;
            }

            return;
         case 1:
            if (System.currentTimeMillis() - this.a > 1000L) {
               this.a = true;
               this.a.e = false;
               this.a.j = 0;
            }

            ++this.a.k;
         default:
            return;
         }
      case 7:
         switch(this.b) {
         case 0:
            var7 = (var2 = (int[])this.a)[0];
            var4 = var2[1];
            int var5 = var2[2];
            int var8 = var2[3];
            this.a.e = var7;
            this.a.f = var5;
            this.a = var4;
            this.b = var8;
            this.b = 1;
            this.a.b = true;
            return;
         case 1:
            boolean var6;
            if (!(var6 = au.a(this.a - this.a.e) < 2)) {
               var7 = this.a - this.a.e >> 1;
               var10000 = this.a;
               var10000.e += var7;
            } else {
               this.a.a.h = this.a;
               var6 = true;
            }

            boolean var9;
            if (!(var9 = au.a(this.b - this.a.f) < 2)) {
               var4 = this.b - this.a.f >> 1;
               var10000 = this.a;
               var10000.f += var4;
            } else {
               this.a.a.i = this.b;
               var9 = true;
            }

            if (var6 && var9) {
               this.a = true;
               this.a.b = false;
            }
         default:
            return;
         }
      case 8:
         switch(this.b) {
         case 0:
            this.a.l = 1;
            this.b = 1;
            return;
         case 1:
            ++this.a.l;
            if (this.a.l == 4) {
               this.a = true;
            }

            return;
         default:
            return;
         }
      case 9:
         switch(this.b) {
         case 0:
            this.a = System.currentTimeMillis();
            this.b = 1;
            var2 = (int[])this.a;
            this.a.g = var2[0];
            this.a.h = var2[1];
            this.a.i = var2[2];
            this.a.d = true;
            bi.a(this.a, (b)null);
            bi.a(this.a, this.a.a());
            byte var3 = (byte)(this.a.d == 0 ? 0 : 1);
            bi.a(this.a).a(var3);
            if (bi.a(this.a) != null) {
               bi.a(this.a).b(0);
            } else {
               this.a = true;
               this.a.d = false;
            }
            break;
         case 1:
            if (bi.a(this.a) != null && !bi.a(this.a).a()) {
               this.a = true;
               this.a.d = false;
            }
         default:
            return;
         }
      }

   }
}
