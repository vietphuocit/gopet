import javax.microedition.lcdui.Image;

final class dc extends fn {
   public cx a;

   private dc(db var1) {
   }

   public final void c() {
      bc.a.setColor(0);
      bc.a.fillRect(2, 2, this.t - 4, this.u - 4);
   }

   public final void e() {
      super.e();
      if (this.a != null) {
         this.a.e();
      }

   }

   protected final void b() {
      if (this.e) {
         bc.a.setColor(gg.d);
         bc.a.drawRect(0, 0, this.t - 1, this.u - 1);
         bc.a.drawRect(1, 1, this.t - 3, this.u - 3);
      }

   }

   public final void a() {
      if (this.a != null) {
         Image var1;
         if (this.a.b != null && (var1 = br.a.a(this.a.b)) != null) {
            bc.a.drawImage(var1, this.t >> 1, this.u >> 1, 3);
         }

         if (this.a.b != 0 && this.a.d != null) {
            v.d().a(bc.a, this.a.d, 0, 0, 0);
         }
      }

   }

   dc(db var1, byte var2) {
      this(var1);
   }
}
