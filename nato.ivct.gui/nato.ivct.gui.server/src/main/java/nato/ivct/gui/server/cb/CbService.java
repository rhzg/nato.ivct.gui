package nato.ivct.gui.server.cb;

import java.util.HashMap;

import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

import nato.ivct.gui.shared.cb.CbFormData;
import nato.ivct.gui.shared.cb.CbTablePageData;
import nato.ivct.gui.shared.cb.CreateCbPermission;
import nato.ivct.gui.shared.cb.ICbService;
import nato.ivct.gui.shared.cb.ReadCbPermission;
import nato.ivct.gui.shared.cb.UpdateCbPermission;
import nato.ivct.gui.shared.cb.CbTablePageData.CbTableRowData;

public class CbService implements ICbService {

	HashMap<String, CbTableRowData> cb_hm = new HashMap<String, CbTableRowData>();

	@Override
	public CbTablePageData getCbTableData(SearchFilter filter) {
		CbTablePageData pageData = new CbTablePageData();

		// create some sample capabilities.
		CbTableRowData row;

		row = pageData.addRow();
		row.setCapabilityName("HLA_BASE_2016");
		row.setCapabilityDescription("The Basic HLA Certification Test");
		row.setCbVisual(
				"https://smart-wiki.smart-lab.se/download/attachments/79560745/cwix-dr-2017.jpg?version=1&modificationDate=1484924038000&api=v2");
		row.setCpId("001");
		cb_hm.put(row.getCpId(), row);

		row = pageData.addRow();
		row.setCapabilityName("NETN-AGG-2016");
		row.setCapabilityDescription("NETN-FOM v2.0 Aggregate FOM Module");
		row.setCbVisual("visual");
		row.setCpId("002");
		cb_hm.put(row.getCpId(), row);

		row = pageData.addRow();
		row.setCapabilityName("NETN-ENTITY-2016");
		row.setCapabilityDescription("NETN FOM v2.0 Physical FOM Module");
		row.setCbVisual("visual");
		row.setCpId("003");
		cb_hm.put(row.getCpId(), row);

		row = pageData.addRow();
		row.setCapabilityName("CWIX-DR-2017");
		row.setCapabilityDescription("Simulation Interoperability Compliance Badge for CWIX 2017");
		row.setCbVisual("visual");
		row.setCpId("004");
		cb_hm.put(row.getCpId(), row);

		return pageData;
	}

	@Override
	public CbTablePageData getCbTableData(SearchFilter filter, String sutId) {
		// TODO Auto-generated method stub

		// just for testing add sample data
		CbTablePageData pageData = new CbTablePageData();
		CbTableRowData row;

		row = pageData.addRow();
		row.setCapabilityName("HLA_BASE_2016");
		row.setCapabilityDescription("The Basic HLA Certification Test");
		row.setCbVisual(
				"https://smart-wiki.smart-lab.se/download/attachments/79560745/cwix-dr-2017.jpg?version=1&modificationDate=1484924038000&api=v2");
		row.setCpId("001");
		cb_hm.put(row.getCpId(), row);

		row = pageData.addRow();
		row.setCapabilityName("NETN-AGG-2016");
		row.setCapabilityDescription("NETN-FOM v2.0 Aggregate FOM Module");
		row.setCbVisual("visual");
		row.setCpId("002");
		cb_hm.put(row.getCpId(), row);

		row = pageData.addRow();
		row.setCapabilityName("NETN-ENTITY-2016");
		row.setCapabilityDescription("NETN FOM v2.0 Physical FOM Module");
		row.setCbVisual("visual");
		row.setCpId("003");
		cb_hm.put(row.getCpId(), row);

		return pageData;
	}

	@Override
	public CbFormData prepareCreate(CbFormData formData) {
		if (!ACCESS.check(new CreateCbPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [hzg] add business logic here.
		return formData;
	}

	@Override
	public CbFormData create(CbFormData formData) {
		if (!ACCESS.check(new CreateCbPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [hzg] add business logic here.
		return formData;
	}

	@Override
	public CbFormData load(CbFormData formData) {
		if (!ACCESS.check(new ReadCbPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [hzg] add business logic here.
		return formData;
	}

	@Override
	public CbFormData store(CbFormData formData) {
		if (!ACCESS.check(new UpdateCbPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [hzg] add business logic here.
		return formData;
	}
}
