public final class aw extends gh {
   private int b;
   private byte a;
   private String a;
   private int c;
   private boolean c = true;
   private int d;
   private int e;
   private int f;

   public final void a() {
      this.a = true;
      this.a = (byte)((int)(System.currentTimeMillis() % 3L));
   }

   public aw(String var1) {
      this.a = var1;
      this.b = true;
      if (var1 != null && var1.length() > 0) {
         this.c = v.b().a(var1) + 2 >> 1;
         this.e = -this.c;
         this.f = bc.d;
      }

   }

   public final void b() {
      bc.a.setColor(0);
      if (this.c) {
         int var1;
         int var2;
         int var3;
         int var4;
         int var5;
         label47:
         switch(this.a) {
         case 0:
            bc.a.fillRect(0, 0, bc.b, (bc.c >> 1) - this.b);
            var1 = (bc.c >> 1) + this.b;
            bc.a.fillRect(0, var1, bc.b, bc.c - var1);
            break;
         case 1:
            var2 = 32 - (this.b << 1);
            var3 = 0;

            while(true) {
               if (var3 >= (bc.c >> 5) + 1) {
                  break label47;
               }

               for(var4 = 0; var4 < (bc.b >> 5) + 1; ++var4) {
                  bc.a.setColor(0);
                  var5 = (var4 << 5) + this.b;
                  var1 = (var3 << 5) + this.b;
                  bc.a.fillRect(var5, var1, var2, var2);
               }

               ++var3;
            }
         case 2:
            var2 = 46 - (this.b << 1);

            for(var3 = 0; var3 < (bc.c >> 5) + 1; ++var3) {
               for(var4 = 0; var4 < (bc.b >> 5) + 1; ++var4) {
                  bc.a.setColor(0);
                  var5 = (var4 << 5) + this.b - 7;
                  var1 = (var3 << 5) + this.b - 7;
                  bc.a.fillArc(var5, var1, var2, var2, 0, 360);
               }
            }
         }
      }

      if (this.d > 1) {
         v.b().a(bc.a, this.a, this.e, bc.e, 17);
      }

   }

   public final void a(long var1) {
      if (this.c) {
         switch(this.a) {
         case 0:
            this.b += 10;
            if (this.b > bc.c >> 1) {
               this.c = false;
               return;
            }
            break;
         case 1:
            ++this.b;
            if (this.b > 16) {
               this.c = false;
               return;
            }
            break;
         case 2:
            ++this.b;
            if (this.b > 23) {
               this.c = false;
            }
         }

         return;
      } else {
         ++this.d;
         if (this.d >= 15 && this.d <= 17) {
            if (this.d == 15) {
               this.f = bc.b + this.c;
            }
         } else {
            this.e = this.f + this.e >> 1;
         }

         if (this.d > 32) {
            this.a = false;
         }
      }

   }
}
