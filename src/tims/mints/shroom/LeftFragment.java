package tims.mints.shroom;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class LeftFragment extends Fragment {

	Button BeerBtn;
	Button CoctailsBtn;
	Button ShotsBtn;
	Button FoodBtn;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,  Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.left_side_fragment,container,false);
		
		Button BeerBtn = (Button) view.findViewById(R.id.beer_btn);
		BeerBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		return view;
	
	}
	
	
	
}
