/*******************************************************************************
 * Copyright 2017 Capital One Services, LLC and Bitwise, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 *******************************************************************************/
package hydrograph.engine.transformation.userfunctions.filter;

import hydrograph.engine.transformation.userfunctions.base.FilterBase;
import hydrograph.engine.transformation.userfunctions.base.ReusableRow;

import java.util.ArrayList;
import java.util.Properties;
/**
 * The Class CustomFilterForFilterComponent.
 *
 * @author Bitwise
 *
 */
public class CustomFilterForFilterComponent implements FilterBase {

	
	@Override
	public void prepare(Properties props, ArrayList<String> inputFields) {
	}

	@Override
	public boolean isRemove(ReusableRow reusableRow) {
		String input=reusableRow.getString(0);
		return input.equals("C1R1");
	}

	@Override
	public void cleanup() {

	}

}
