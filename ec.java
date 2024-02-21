import javax.microedition.lcdui.Image;

public final class ec extends ff {
   private boolean d;
   private long a;
   private Image a;
   private final ea a;

   public ec(ea var1, Image var2, gq var3) {
      this.a = var1;
      this.d = false;
      this.a = 0L;
      this.x = 0;
      this.y = 0;
      this.a(0, 0, 28, 27);
      this.a = var2;
      this.d = var3;
   }

   public final void a(Image var1) {
      this.a = var1;
   }

   protected final void b() {
   }

   public final void c() {
   }

   public final void a() {
      Image var1 = this.e ? this.a.a.a[1] : this.a.a.a[0];
      bc.a.drawImage(var1, this.t - var1.getWidth() >> 1, this.u - var1.getHeight() >> 1, 0);
      if (!this.e) {
         this.d = false;
      }

      if (this.d) {
         bc.a.drawImage(this.a, this.t - this.a.getWidth() >> 1, (this.u - this.a.getHeight() >> 1) - 2, 0);
      } else {
         bc.a.drawImage(this.a, this.t - this.a.getWidth() >> 1, this.u - this.a.getHeight() >> 1, 0);
      }

      long var2 = System.currentTimeMillis();
      if (this.e && var2 - this.a >= 300L) {
         this.a = var2;
         this.d = !this.d;
      }

   }
}
