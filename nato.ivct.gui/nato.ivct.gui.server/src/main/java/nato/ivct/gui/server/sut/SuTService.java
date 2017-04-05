package nato.ivct.gui.server.sut;

import java.util.HashMap;

import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

import nato.ivct.gui.shared.sut.CreateSuTPermission;
import nato.ivct.gui.shared.sut.ISuTService;
import nato.ivct.gui.shared.sut.ReadSuTPermission;
import nato.ivct.gui.shared.sut.SuTFormData;
import nato.ivct.gui.shared.sut.SuTTablePageData;
import nato.ivct.gui.shared.sut.UpdateSuTPermission;
import nato.ivct.gui.shared.sut.SuTTablePageData.SuTTableRowData;

public class SuTService implements ISuTService {

	HashMap<String, SuTTableRowData> sut_hm = new HashMap<String, SuTTableRowData>();

	@Override
	public SuTTablePageData getSuTTableData(SearchFilter filter) {
		SuTTablePageData pageData = new SuTTablePageData();
		// TODO [hzg] fill pageData.

		// create some sample data
		SuTTableRowData row;

		row = pageData.addRow();
		row.setSuTid("HelloWorld");
		row.setSuTDescription("Sample Federated HelloWorld");
		sut_hm.put(row.getSuTid(), row);

		row = pageData.addRow();
		row.setSuTid("HelloWorld");
		row.setSuTDescription("Another Sample Federated HelloWorld");
		sut_hm.put(row.getSuTid(), row);

		return pageData;
	}

	@Override
	public SuTFormData prepareCreate(SuTFormData formData) {
		if (!ACCESS.check(new CreateSuTPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [hzg] add business logic here.
		return formData;
	}

	@Override
	public SuTFormData create(SuTFormData formData) {
		if (!ACCESS.check(new CreateSuTPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [hzg] add business logic here.
		return formData;
	}

	@Override
	public SuTFormData load(SuTFormData formData) {
		if (!ACCESS.check(new ReadSuTPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [hzg] add business logic here.
		return formData;
	}

	@Override
	public SuTFormData store(SuTFormData formData) {
		if (!ACCESS.check(new UpdateSuTPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [hzg] add business logic here.
		return formData;
	}
}
