/**
 * Copyright 2011 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package robobinding.binding.viewattribute;

import robobinding.beans.PresentationModelAdapter;
import robobinding.presentationmodel.AbstractDataSetValueModel;
import robobinding.presentationmodel.DataSetAdapter;
import android.content.Context;

/**
 * 
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 */
public class SourceAttribute implements AdapterViewAttribute
{
	private PropertyBinding propertyBinding;

	public SourceAttribute(String sourceAttributeValue)
	{
		this.propertyBinding = new PropertyBinding(sourceAttributeValue);
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	public void bind(final DataSetAdapter<?> dataSetAdapter, PresentationModelAdapter presentationModelAdapter, Context context)
	{
		AbstractDataSetValueModel dataSetValueModel = presentationModelAdapter.getDataSetPropertyValueModel(propertyBinding.propertyName);
		dataSetAdapter.setValueModel(dataSetValueModel);
	}
}