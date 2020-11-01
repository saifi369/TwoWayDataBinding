package com.example.twowaydatabinding.databinding;
import com.example.twowaydatabinding.R;
import com.example.twowaydatabinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.et_email, 3);
        sViewsWithIds.put(R.id.et_username, 4);
        sViewsWithIds.put(R.id.layout_gender, 5);
        sViewsWithIds.put(R.id.rg_gender, 6);
        sViewsWithIds.put(R.id.rb_male, 7);
        sViewsWithIds.put(R.id.rb_female, 8);
        sViewsWithIds.put(R.id.layout_city, 9);
        sViewsWithIds.put(R.id.spinner_city, 10);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerRunCodeAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.RadioButton) bindings[8]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioGroup) bindings[6]
            , (android.widget.Spinner) bindings[10]
            , (android.widget.TextView) bindings[2]
            );
        this.btnUpdate.setTag(null);
        this.container.setTag(null);
        this.tvOutput.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handler == variableId) {
            setHandler((com.example.twowaydatabinding.MainActivity) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.twowaydatabinding.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.example.twowaydatabinding.MainActivity Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.twowaydatabinding.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.twowaydatabinding.MainActivity handler = mHandler;
        com.example.twowaydatabinding.model.User viewModelUser = null;
        java.lang.String viewModelUserToString = null;
        android.view.View.OnClickListener handlerRunCodeAndroidViewViewOnClickListener = null;
        com.example.twowaydatabinding.viewmodel.MainViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler::runCode
                    handlerRunCodeAndroidViewViewOnClickListener = (((mHandlerRunCodeAndroidViewViewOnClickListener == null) ? (mHandlerRunCodeAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerRunCodeAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (viewModel != null) {
                    // read viewModel.user
                    viewModelUser = viewModel.getUser();
                }


                if (viewModelUser != null) {
                    // read viewModel.user.toString()
                    viewModelUserToString = viewModelUser.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.btnUpdate.setOnClickListener(handlerRunCodeAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOutput, viewModelUserToString);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.twowaydatabinding.MainActivity value;
        public OnClickListenerImpl setValue(com.example.twowaydatabinding.MainActivity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.runCode(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}