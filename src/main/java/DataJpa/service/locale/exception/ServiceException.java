package DataJpa.service.locale.exception;

import DataJpa.AppException;

public class ServiceException extends AppException {
    public ServiceException(String code, Object... params) {
        super(code, params);
    }

    public ServiceException(String code, Throwable cause, Object... params) {
        super(code, cause, params);
    }
}
