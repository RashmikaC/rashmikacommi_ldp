

export function Button({ onSmash, children }:{onSmash:any,children:any}) {
    return (
      <button onClick={onSmash}>
        {children}
      </button>
    );
  }
  