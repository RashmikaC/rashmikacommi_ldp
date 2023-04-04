import { Button } from "./Button";

export  function UploadButton() {
    return (
      <Button onSmash={() => alert('Uploading!')}>
        Upload Image
      </Button>
    );
  }