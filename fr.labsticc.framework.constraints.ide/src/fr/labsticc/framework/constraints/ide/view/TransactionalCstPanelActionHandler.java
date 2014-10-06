package fr.labsticc.framework.constraints.ide.view;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.edit.domain.EditingDomain;

import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.service.IConstraintExpressionServicesFacade;
import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.emf.view.editor.AbstractEditorCommand;

public class TransactionalCstPanelActionHandler extends	BasicConstraintPanelActionHandler {

	public TransactionalCstPanelActionHandler( 	final FormalLanguageExpression p_expression,
												final IConstraintExpressionServicesFacade p_constraintDelegate,
												final IExceptionHandler p_exceptionHandler )
	throws CoreException {
		super(p_expression, p_constraintDelegate, p_exceptionHandler);
	}

	@Override
	public void constraintTextChanged( 	final String p_languageId,
										final String p_newConstraintText ) {
	    executeCommand( new AbstractEditorCommand<Object>( getExpression() ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		TransactionalCstPanelActionHandler.super.constraintTextChanged( p_languageId, p_newConstraintText );
	    	}
	    } );
	}
	
	@Override
	public Collection<String> addLibrariesRequested( 	final String p_languageId,
														final Collection<String> p_currentLibraryNames ) {
	    return executeCommand( new AbstractEditorCommand<Collection<String>>( getExpression() ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( TransactionalCstPanelActionHandler.super.addLibrariesRequested( p_languageId, p_currentLibraryNames ) );
	    	}
	    } );
	}

	@Override
	public Collection<String> constraintLanguageChanged( final String p_newLanguageId ) {
	    return executeCommand( new AbstractEditorCommand<Collection<String>>( getExpression() ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( TransactionalCstPanelActionHandler.super.constraintLanguageChanged( p_newLanguageId ) );
	    	}
	    } );
	}
	
	@Override
	public String constraintLoadingRequested( final String p_languageId ) {
	    return executeCommand( new AbstractEditorCommand<String>( getExpression() ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( TransactionalCstPanelActionHandler.super.constraintLoadingRequested( p_languageId ) );
	    	}
	    } );
	}
	
	@Override
	public void librariesDeleted( final Collection<String> p_libraryNames ) {
	    executeCommand( new AbstractEditorCommand<Object>( getExpression() ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		TransactionalCstPanelActionHandler.super.librariesDeleted( p_libraryNames );
	    	}
	    } );
	}

	protected <T> T executeCommand( final AbstractEditorCommand<T> p_command ) {
		Throwable exception = null;
		final EditingDomain editingDomain = p_command.getEditingDomain();
		
		if ( editingDomain == null ) {
			p_command.execute();
		}
		else {
			editingDomain.getCommandStack().execute( p_command );
		}

		exception = p_command.getException();
		
		if ( exception == null ) {
			return p_command.getExecResult();
		}
		
		handleException( exception, p_command.getContext() );
		
		return null;
	}
}
