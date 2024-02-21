import javax.microedition.lcdui.Graphics;

public final class gb {
   public ga a;
   public int a;
   private boolean a = true;
   private boolean b = true;
   private long a;

   public gb(ga var1) {
      this.a = var1;
   }

   public final void a() {
      this.a = System.currentTimeMillis();
      this.a = 0;
   }

   public final void a(Graphics var1, int var2, int var3, int var4) {
      this.a(var1, this.a, var2, var3, var4);
   }

   public final void a(long var1) {
      if (this.a && var1 - this.a > (long)this.a.a[this.a]) {
         ++this.a;
         this.a = var1;
         if (this.a > this.a.a.length - 1) {
            this.a = 0;
            if (!this.b) {
               this.a = false;
            }
         }
      }

   }

   public final void b(Graphics var1, int var2, int var3, int var4) {
      long var5;
      if (this.a && (var5 = System.currentTimeMillis()) - this.a > (long)this.a.a[this.a]) {
         ++this.a;
         this.a = var5;
         if (this.a > this.a.a.length - 1) {
            this.a = 0;
            if (!this.b) {
               this.a = false;
            }
         }
      }

      this.a(var1, this.a, var2, var3, 0);
   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5) {
      gd var11 = this.a.a.a[this.a.a[var2]];

      for(int var10 = 0; var10 < var11.a.length; ++var10) {
         ge var9 = this.a.a.a[var11.a[var10]];
         int var6 = (var5 & 2) == 0 ? var11.a[var10] + var3 : -var11.a[var10] - var9.c + var3;
         int var7 = (var5 & 1) == 0 ? var11.b[var10] + var4 : -var11.b[var10] - var9.d + var4;
         int var8 = var11.b[var10];
         if (var5 == 2) {
            var8 = (var11.b[var10] + var5) % 4;
         } else if (var5 == 1) {
            var8 = var11.b[var10] ^ var5;
         }

         var1.drawRegion(this.a.a, var9.a, var9.b, var9.c, var9.d, var8, var6, var7, 0);
      }

   }
}
