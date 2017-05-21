package nl.dionsegijn.konfettidemo.configurations.selection_views

import android.content.Context
import android.view.Gravity
import android.widget.LinearLayout
import nl.dionsegijn.konfettidemo.R

/**
 * Created by dionsegijn on 5/21/17.
 */
class SpeedSelectionView(context: Context?) : LinearLayout(context) {

    init {
        inflate(context, R.layout.view_section_speed_selection, this)
        orientation = VERTICAL
        gravity = Gravity.CENTER
    }

}
