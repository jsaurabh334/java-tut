package sample_programs.inner_classes;

class Button {
    interface OnClickListener {
        void onClick();
    }
    private OnClickListener listener;
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}

/**
 * AIM: Model real-life UI event handling using Anonymous Inner Classes.
 */
public class RealLife_InnerClass {
    public static void main(String[] args) {
        Button btn = new Button();
        // Registering listener using anonymous class
        btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick() {
                System.out.println("Submit Button Clicked.");
            }
        });
        btn.click();
    }
}
